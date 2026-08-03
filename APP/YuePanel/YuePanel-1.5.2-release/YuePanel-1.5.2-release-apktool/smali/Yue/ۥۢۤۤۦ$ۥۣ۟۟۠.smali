.class public final LYue/ۥۢۤۤۦ$ۥۣ۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1f
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۤۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e0\u06e3"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣۡۢۢ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۡۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥۣۡۢۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۤۤۦ$ۥۣ۟۟۠;->ۥ:LYue/ۥۣۡۢۢ;

    return-void
.end method


# virtual methods
.method public onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/ContentInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p2}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟ۧ(Landroid/view/ContentInfo;)LYue/ۥۣ۟ۧۡ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢۤۤۦ$ۥۣ۟۟۠;->ۥ:LYue/ۥۣۡۢۢ;

    invoke-interface {v1, p1, v0}, LYue/ۥۣۡۢۢ;->ۥ(Landroid/view/View;LYue/ۥۣ۟ۧۡ;)LYue/ۥۣ۟ۧۡ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟ۦ()Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
