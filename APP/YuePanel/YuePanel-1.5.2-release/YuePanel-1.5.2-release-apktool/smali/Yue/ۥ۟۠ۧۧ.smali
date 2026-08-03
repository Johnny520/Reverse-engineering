.class public final LYue/ۥ۟۠ۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x22
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۟۠ۧۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟۠ۧۧ;

    invoke-direct {v0}, LYue/ۥ۟۠ۧۧ;-><init>()V

    sput-object v0, LYue/ۥ۟۠ۧۧ;->ۥ:LYue/ۥ۟۠ۧۧ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(FFFI)Landroid/window/BackEvent;
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/window/BackEvent;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/window/BackEvent;-><init>(FFFI)V

    return-object v0
.end method

.method public final ۥ۟(Landroid/window/BackEvent;)F
    .locals 1
    .param p1    # Landroid/window/BackEvent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/window/BackEvent;->getProgress()F

    move-result p1

    return p1
.end method

.method public final ۥ۟۟(Landroid/window/BackEvent;)I
    .locals 1
    .param p1    # Landroid/window/BackEvent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/window/BackEvent;->getSwipeEdge()I

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟(Landroid/window/BackEvent;)F
    .locals 1
    .param p1    # Landroid/window/BackEvent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/window/BackEvent;->getTouchX()F

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟۟(Landroid/window/BackEvent;)F
    .locals 1
    .param p1    # Landroid/window/BackEvent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/window/BackEvent;->getTouchY()F

    move-result p1

    return p1
.end method
