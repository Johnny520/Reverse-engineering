.class public final LYue/ۥۡۡۤۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢۡۧ$ۥ۟۟;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation


# static fields
.field public static final ۥ۟:LYue/ۥۡۡۤۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۡۤۨ;

    invoke-direct {v0}, LYue/ۥۡۡۤۨ;-><init>()V

    sput-object v0, LYue/ۥۡۡۤۨ;->ۥ۟:LYue/ۥۡۡۤۨ;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sput-wide v0, LYue/ۥۡۡۤۨ;->ۥ۟۟:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final ۥ۟۟۟۠()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sget-wide v2, LYue/ۥۡۡۤۨ;->ۥ۟۟:J

    sub-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "TimeSource(System.nanoTime())"

    return-object v0
.end method

.method public bridge synthetic ۥ()LYue/ۥ۟ۦۡۦ;
    .locals 2

    .line 1
    invoke-virtual {p0}, LYue/ۥۡۡۤۨ;->ۥ۟۟۟۟()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ()LYue/ۥۣۢۡۦ;
    .locals 2

    .line 2
    invoke-virtual {p0}, LYue/ۥۡۡۤۨ;->ۥ۟۟۟۟()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟(JJ)J
    .locals 1

    sget-object v0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۠;

    invoke-static {p1, p2, v0, p3, p4}, LYue/ۥۣ۠ۨۡ;->ۥ۟۟۟(JLYue/ۥۣ۠۠;J)J

    move-result-wide p1

    invoke-static {p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۤ(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ۥ۟۟(JJ)J
    .locals 1

    sget-object v0, LYue/ۥۣ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۠;

    invoke-static {p1, p2, p3, p4, v0}, LYue/ۥۣ۠ۨۡ;->ۥ۟۟۟ۢ(JJLYue/ۥۣ۠۠;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ۥ۟۟۟(J)J
    .locals 3

    invoke-direct {p0}, LYue/ۥۡۡۤۨ;->ۥ۟۟۟۠()J

    move-result-wide v0

    sget-object v2, LYue/ۥۣ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۠;

    invoke-static {v0, v1, p1, p2, v2}, LYue/ۥۣ۠ۨۡ;->ۥ۟۟۟۠(JJLYue/ۥۣ۠۠;)J

    move-result-wide p1

    return-wide p1
.end method

.method public ۥ۟۟۟۟()J
    .locals 2

    invoke-direct {p0}, LYue/ۥۡۡۤۨ;->ۥ۟۟۟۠()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۤ(J)J

    move-result-wide v0

    return-wide v0
.end method
