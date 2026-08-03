package com.bumptech.glide.request.target;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7118;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class NotificationTarget extends CustomTarget<Bitmap> {
    private final Context context;
    private final Notification notification;
    private final int notificationId;
    private final String notificationTag;
    private final RemoteViews remoteViews;
    private final int viewId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void setBitmap(@InterfaceC6490 Bitmap bitmap) {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
    }

    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    private void update() {
        ((NotificationManager) Preconditions.checkNotNull((NotificationManager) this.context.getSystemService("notification"))).notify(this.notificationTag, this.notificationId, this.notification);
    }

    @Override // com.bumptech.glide.request.target.Target
    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onLoadCleared(@InterfaceC6490 Drawable drawable) {
        setBitmap(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.request.target.Target
    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public /* bridge */ /* synthetic */ void onResourceReady(@InterfaceC6391 Object obj, @InterfaceC6490 Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onResourceReady(@InterfaceC6391 Bitmap bitmap, @InterfaceC6490 Transition<? super Bitmap> transition) {
        setBitmap(bitmap);
    }

    @InterfaceC7118("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.context = (Context) Preconditions.checkNotNull(context, "Context must not be null!");
        this.notification = (Notification) Preconditions.checkNotNull(notification, "Notification object can not be null!");
        this.remoteViews = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.viewId = i3;
        this.notificationId = i4;
        this.notificationTag = str;
    }
}
