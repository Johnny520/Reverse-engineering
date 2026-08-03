.class public abstract LYue/ۥۢ۠ۨۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ۥۣ۟۟۠:J
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:LYue/ۥۢ۠ۨۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 4
    sget-object v2, LYue/ۥۢۡ۟ۤ;->ۥۣ۟۟۟:LYue/ۥۢ۠ۨۨ;

    invoke-direct {p0, v0, v1, v2}, LYue/ۥۢ۠ۨۧ;-><init>(JLYue/ۥۢ۠ۨۨ;)V

    return-void
.end method

.method public constructor <init>(JLYue/ۥۢ۠ۨۨ;)V
    .locals 0
    .param p3    # LYue/ۥۢ۠ۨۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, LYue/ۥۢ۠ۨۧ;->ۥۣ۟۟۠:J

    .line 3
    iput-object p3, p0, LYue/ۥۢ۠ۨۧ;->ۥ۟۟۠ۤ:LYue/ۥۢ۠ۨۨ;

    return-void
.end method


# virtual methods
.method public final ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۨۧ;->ۥ۟۟۠ۤ:LYue/ۥۢ۠ۨۨ;

    invoke-interface {v0}, LYue/ۥۢ۠ۨۨ;->ۥۣ۟۟ۤ()I

    move-result v0

    return v0
.end method
