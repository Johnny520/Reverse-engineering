.class public final LTk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Las;


# static fields
.field public static final b:Lut;


# instance fields
.field public final a:LXm;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"

    invoke-static {v1, v0}, Lut;->a(Ljava/lang/String;Ljava/lang/Object;)Lut;

    move-result-object v0

    sput-object v0, LTk;->b:Lut;

    return-void
.end method

.method public constructor <init>(LXm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTk;->a:LXm;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LYj;

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljava/lang/Object;IILvt;)LZr;
    .locals 2

    check-cast p1, LYj;

    iget-object p2, p0, LTk;->a:LXm;

    if-eqz p2, :cond_1

    iget-object p2, p2, LXm;->b:Ljava/lang/Object;

    check-cast p2, LXr;

    invoke-static {p1}, LYr;->a(Ljava/lang/Object;)LYr;

    move-result-object p3

    invoke-virtual {p2, p3}, LCp;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYr;->b:Ljava/util/ArrayDeque;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1, p3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    check-cast v0, LYj;

    if-nez v0, :cond_0

    invoke-static {p1}, LYr;->a(Ljava/lang/Object;)LYr;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, LCp;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p1, v0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    :goto_0
    sget-object p2, LTk;->b:Lut;

    invoke-virtual {p4, p2}, Lvt;->c(Lut;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    new-instance p3, LZr;

    new-instance p4, LUk;

    invoke-direct {p4, p1, p2}, LUk;-><init>(LYj;I)V

    invoke-direct {p3, p1, p4}, LZr;-><init>(LSm;Ltc;)V

    return-object p3
.end method
