.class public LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/Person;)Landroid/os/Parcelable;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    return-object p0
.end method

.method public static ۥ۟(Ljava/lang/CharSequence;JLandroid/app/Person;)Landroid/app/Notification$MessagingStyle$Message;
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, Landroid/app/Notification$MessagingStyle$Message;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/app/Notification$MessagingStyle$Message;-><init>(Ljava/lang/CharSequence;JLandroid/app/Person;)V

    return-object v0
.end method
