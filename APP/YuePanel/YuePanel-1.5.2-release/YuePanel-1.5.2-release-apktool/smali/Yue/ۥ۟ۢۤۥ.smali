.class public final LYue/ۥ۟ۢۤۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢۤۥ$ۥ;,
        LYue/ۥ۟ۢۤۥ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:LYue/ۥ۟ۢۤۥ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:I = 0x0

.field public static final ۥ۟۟۟ۡ:I = 0x1


# instance fields
.field public final ۥ:F

.field public final ۥ۟:F

.field public final ۥ۟۟:F

.field public final ۥ۟۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۟ۢۤۥ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟ۢۤۥ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۢۤۥ$ۥ;

    return-void
.end method

.method public constructor <init>(FFFI)V
    .locals 0
    .param p3    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LYue/ۥ۟ۢۤۥ;->ۥ:F

    .line 3
    iput p2, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟:F

    .line 4
    iput p3, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟:F

    .line 5
    iput p4, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟۟:I

    return-void
.end method

.method public constructor <init>(Landroid/window/BackEvent;)V
    .locals 4
    .param p1    # Landroid/window/BackEvent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x22
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, LYue/ۥ۟۠ۧۧ;->ۥ:LYue/ۥ۟۠ۧۧ;

    invoke-virtual {v0, p1}, LYue/ۥ۟۠ۧۧ;->ۥ۟۟۟(Landroid/window/BackEvent;)F

    move-result v1

    .line 7
    invoke-virtual {v0, p1}, LYue/ۥ۟۠ۧۧ;->ۥ۟۟۟۟(Landroid/window/BackEvent;)F

    move-result v2

    .line 8
    invoke-virtual {v0, p1}, LYue/ۥ۟۠ۧۧ;->ۥ۟(Landroid/window/BackEvent;)F

    move-result v3

    .line 9
    invoke-virtual {v0, p1}, LYue/ۥ۟۠ۧۧ;->ۥ۟۟(Landroid/window/BackEvent;)I

    move-result p1

    .line 10
    invoke-direct {p0, v1, v2, v3, p1}, LYue/ۥ۟ۢۤۥ;-><init>(FFFI)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BackEventCompat{touchX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۟ۢۤۥ;->ۥ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", touchY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", swipeEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()F
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟:F

    return v0
.end method

.method public final ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟۟:I

    return v0
.end method

.method public final ۥ۟۟()F
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۤۥ;->ۥ:F

    return v0
.end method

.method public final ۥ۟۟۟()F
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟:F

    return v0
.end method

.method public final ۥ۟۟۟۟()Landroid/window/BackEvent;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x22
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    sget-object v0, LYue/ۥ۟۠ۧۧ;->ۥ:LYue/ۥ۟۠ۧۧ;

    iget v1, p0, LYue/ۥ۟ۢۤۥ;->ۥ:F

    iget v2, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟:F

    iget v3, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟:F

    iget v4, p0, LYue/ۥ۟ۢۤۥ;->ۥ۟۟۟:I

    invoke-virtual {v0, v1, v2, v3, v4}, LYue/ۥ۟۠ۧۧ;->ۥ(FFFI)Landroid/window/BackEvent;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This method is only supported on API level 34+"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
