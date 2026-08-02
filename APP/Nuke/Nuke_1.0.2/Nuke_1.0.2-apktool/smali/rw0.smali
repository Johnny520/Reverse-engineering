.class public final Lrw0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljh1;


# static fields
.field public static final b:Lmv1;


# instance fields
.field public final a:Lhh1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x9c4

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lmv1;->a(Ljava/lang/String;Ljava/lang/Object;)Lmv1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lrw0;->b:Lmv1;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lhh1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrw0;->a:Lhh1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcq0;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final b(Ljava/lang/Object;IILov1;)Lih1;
    .locals 1

    .line 1
    check-cast p1, Lcq0;

    .line 2
    .line 3
    iget-object p0, p0, Lrw0;->a:Lhh1;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lfh1;

    .line 10
    .line 11
    invoke-static {p1}, Lgh1;->a(Ljava/lang/Object;)Lgh1;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p2}, Lwd1;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    sget-object v0, Lgh1;->b:Ljava/util/ArrayDeque;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    check-cast p3, Lcq0;

    .line 27
    .line 28
    if-nez p3, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, Lgh1;->a(Ljava/lang/Object;)Lgh1;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p0, p2, p1}, Lwd1;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p1, p3

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p0

    .line 43
    :cond_1
    :goto_0
    sget-object p0, Lrw0;->b:Lmv1;

    .line 44
    .line 45
    invoke-virtual {p4, p0}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    new-instance p2, Lih1;

    .line 56
    .line 57
    new-instance p3, Lzw0;

    .line 58
    .line 59
    invoke-direct {p3, p1, p0}, Lzw0;-><init>(Lcq0;I)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p2, p1, p3}, Lih1;-><init>(La51;Lf40;)V

    .line 63
    .line 64
    .line 65
    return-object p2
.end method
