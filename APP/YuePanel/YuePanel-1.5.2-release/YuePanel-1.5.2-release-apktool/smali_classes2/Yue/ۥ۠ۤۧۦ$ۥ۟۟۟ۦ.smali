.class public final LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n362#2,6:219\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۧۦ;->ۥ۟۠۠۟(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n362#2,6:219\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

.field public final synthetic ۥ۟۟۟۠:I

.field public final synthetic ۥ۟۟۟ۡ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLYue/ۥ۠ۤۧۦ;IJ)V
    .locals 0

    iput-object p3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    iput p4, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    iput-wide p5, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:J

    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 4

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۧ()LYue/ۥ۠ۤۨ۟;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    iget-wide v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:J

    invoke-virtual {v0, v1, v2, v3}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡۡ(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-static {v1, v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟(LYue/ۥ۠ۤۧۦ;Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
