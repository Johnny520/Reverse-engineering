.class public LYue/ۥۣ۟۠۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟۠۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(JLandroid/app/PendingIntent;)Landroid/app/AlarmManager$AlarmClockInfo;
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, Landroid/app/AlarmManager$AlarmClockInfo;

    invoke-direct {v0, p0, p1, p2}, Landroid/app/AlarmManager$AlarmClockInfo;-><init>(JLandroid/app/PendingIntent;)V

    return-object v0
.end method

.method public static ۥ۟(Landroid/app/AlarmManager;Ljava/lang/Object;Landroid/app/PendingIntent;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    check-cast p1, Landroid/app/AlarmManager$AlarmClockInfo;

    invoke-virtual {p0, p1, p2}, Landroid/app/AlarmManager;->setAlarmClock(Landroid/app/AlarmManager$AlarmClockInfo;Landroid/app/PendingIntent;)V

    return-void
.end method
