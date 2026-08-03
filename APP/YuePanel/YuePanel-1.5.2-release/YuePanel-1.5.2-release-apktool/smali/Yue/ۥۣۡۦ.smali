.class public final LYue/ۥۣۡۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۡۦ$ۥ;,
        LYue/ۥۣۡۦ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "\udb3f\udffd"

.field public static final ۥ۟:Ljava/lang/String; = "m"

.field public static final ۥ۟۟:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e1<",
            "Landroid/graphics/Rect;",
            "Landroid/graphics/Rect;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LYue/ۥۣۡۦ;->ۥ۟۟:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/graphics/Paint;Ljava/lang/String;)Z
    .locals 0
    .param p0    # Landroid/graphics/Paint;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۣۡۦ$ۥ;->ۥ(Landroid/graphics/Paint;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟()LYue/ۥۣۡۦۡ;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e1<",
            "Landroid/graphics/Rect;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣۡۦ;->ۥ۟۟:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣۡۦۡ;

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥۣۡۦۡ;

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {v1, v2, v3}, LYue/ۥۣۡۦۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, v1, LYue/ۥۣۡۦۡ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    iget-object v0, v1, LYue/ۥۣۡۦۡ;->ۥ۟:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    :goto_0
    return-object v1
.end method

.method public static ۥ۟۟(Landroid/graphics/Paint;LYue/ۥ۟ۢۧۧ;)Z
    .locals 4
    .param p0    # Landroid/graphics/Paint;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۢۧۧ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt v0, v1, :cond_1

    if-eqz p1, :cond_0

    invoke-static {p1}, LYue/ۥ۟ۢۧۨ$ۥ۟;->ۥ(LYue/ۥ۟ۢۧۧ;)Ljava/lang/Object;

    move-result-object v3

    :cond_0
    invoke-static {p0, v3}, LYue/ۥۣۡۦ$ۥ۟;->ۥ(Landroid/graphics/Paint;Ljava/lang/Object;)V

    return v2

    :cond_1
    if-eqz p1, :cond_4

    invoke-static {p1}, LYue/ۥ۟ۢۧۨ;->ۥ(LYue/ۥ۟ۢۧۧ;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v3, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    return v2

    :cond_4
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return v2
.end method
