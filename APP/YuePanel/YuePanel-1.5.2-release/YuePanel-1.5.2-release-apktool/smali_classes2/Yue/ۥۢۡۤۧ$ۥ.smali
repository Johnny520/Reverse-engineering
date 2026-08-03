.class public final LYue/ۥۢۡۤۧ$ۥ;
.super LYue/ۥۢۡۤۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۤۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢۡۤۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(J)LYue/ۥۢۡۤۧ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    return-object p0
.end method

.method public ۥۣ۟۟۟()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;
    .locals 0
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string p1, "unit"

    invoke-static {p3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
