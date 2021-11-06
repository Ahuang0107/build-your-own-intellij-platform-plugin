package com.example.plugins;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;

public class NotificationAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        NotificationGroup notificationGroup = new NotificationGroup("notification_action_id", NotificationDisplayType.BALLOON, true);
        Notification notification = notificationGroup.createNotification("Notification Test", MessageType.INFO);
        Notifications.Bus.notify(notification);
    }
}
