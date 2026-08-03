package Yue;

import Yue.InterfaceC7144;
import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4516 {

    /* JADX INFO: renamed from: ۥ */
    public final DragAndDropPermissions f938;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۡ$ۥ */
    @InterfaceC7113(24)
    public static class C0422 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m1441(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static DragAndDropPermissions m1442(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public C4516(DragAndDropPermissions dragAndDropPermissions) {
        this.f938 = dragAndDropPermissions;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static C4516 m1439(@InterfaceC6391 Activity activity, @InterfaceC6391 DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsM1442 = C0422.m1442(activity, dragEvent);
        if (dragAndDropPermissionsM1442 != null) {
            return new C4516(dragAndDropPermissionsM1442);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1440() {
        C0422.m1441(this.f938);
    }
}
