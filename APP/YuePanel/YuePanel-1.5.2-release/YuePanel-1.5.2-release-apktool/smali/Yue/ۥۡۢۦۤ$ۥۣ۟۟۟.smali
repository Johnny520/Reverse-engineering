.class public LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:I

.field public ۥ۟۟:Landroid/app/Notification;


# direct methods
.method public constructor <init>(ILandroid/app/Notification;)V
    .locals 1
    .param p2    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0, p1, p2}, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;-><init>(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;->ۥ:Ljava/lang/String;

    .line 3
    iput p2, p0, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;->ۥ۟:I

    .line 4
    iput-object p3, p0, LYue/ۥۡۢۦۤ$ۥۣ۟۟۟;->ۥ۟۟:Landroid/app/Notification;

    return-void
.end method
