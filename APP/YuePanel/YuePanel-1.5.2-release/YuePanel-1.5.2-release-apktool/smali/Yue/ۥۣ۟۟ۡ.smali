.class public final LYue/ۥۣ۟۟ۡ;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟۟:Ljava/lang/String; = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field


# instance fields
.field public final ۥ:I

.field public final ۥ۟:LYue/ۥ۟۟ۥۧ;

.field public final ۥ۟۟:I


# direct methods
.method public constructor <init>(ILYue/ۥ۟۟ۥۧ;I)V
    .locals 0
    .param p2    # LYue/ۥ۟۟ۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, LYue/ۥۣ۟۟ۡ;->ۥ:I

    iput-object p2, p0, LYue/ۥۣ۟۟ۡ;->ۥ۟:LYue/ۥ۟۟ۥۧ;

    iput p3, p0, LYue/ۥۣ۟۟ۡ;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    iget v1, p0, LYue/ۥۣ۟۟ۡ;->ۥ:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, LYue/ۥۣ۟۟ۡ;->ۥ۟:LYue/ۥ۟۟ۥۧ;

    iget v1, p0, LYue/ۥۣ۟۟ۡ;->ۥ۟۟:I

    invoke-virtual {v0, v1, p1}, LYue/ۥ۟۟ۥۧ;->ۥۣ۟۟ۧ(ILandroid/os/Bundle;)Z

    return-void
.end method
