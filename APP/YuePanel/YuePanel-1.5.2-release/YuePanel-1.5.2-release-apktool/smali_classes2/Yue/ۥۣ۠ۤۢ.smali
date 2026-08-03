.class public final LYue/ۥۣ۠ۤۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۤۢ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥۣ۠ۤۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:I = 0x40000


# instance fields
.field public final ۥ:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣ۠ۤۢ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۠ۤۢ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۠ۤۢ;->ۥ۟۟:LYue/ۥۣ۠ۤۢ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۣ۟۠;)V
    .locals 2
    .param p1    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠ۤۢ;->ۥ:LYue/ۥۣۣ۟۠;

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, LYue/ۥۣ۠ۤۢ;->ۥ۟:J

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۣۣ۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۤۢ;->ۥ:LYue/ۥۣۣ۟۠;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥ۠ۤۢۢ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠ۤۢۢ$ۥ;-><init>()V

    :goto_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۤۢ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0, v1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟۠(Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    goto :goto_0
.end method

.method public final ۥ۟۟()Ljava/lang/String;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۤۢ;->ۥ:LYue/ۥۣۣ۟۠;

    iget-wide v1, p0, LYue/ۥۣ۠ۤۢ;->ۥ۟:J

    invoke-interface {v0, v1, v2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۢۦ(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LYue/ۥۣ۠ۤۢ;->ۥ۟:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, LYue/ۥۣ۠ۤۢ;->ۥ۟:J

    return-object v0
.end method
