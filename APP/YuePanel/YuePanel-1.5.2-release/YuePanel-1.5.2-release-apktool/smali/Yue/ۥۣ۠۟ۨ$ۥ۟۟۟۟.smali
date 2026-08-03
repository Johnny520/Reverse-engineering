.class public LYue/ۥۣ۠۟ۨ$ۥ۟۟۟۟;
.super LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠۟ۨ;->ۥ۟۟۠۠(Ljava/lang/Object;Landroid/graphics/Rect;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/graphics/Rect;

.field public final synthetic ۥ۟:LYue/ۥۣ۠۟ۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠۟ۨ;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۠۟ۨ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥۣ۠۟ۨ;

    iput-object p2, p0, LYue/ۥۣ۠۟ۨ$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Rect;

    invoke-direct {p0}, LYue/ۥۢۢ۟ۧ$ۥ۟۟۟۠;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۢۢ۟ۧ;)Landroid/graphics/Rect;
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۣ۠۟ۨ$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Rect;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۣ۠۟ۨ$ۥ۟۟۟۟;->ۥ:Landroid/graphics/Rect;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
