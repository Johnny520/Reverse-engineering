.class public final L۟/h2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(L۟/g3;)V
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    sget-object v0, L۟/q;->ۥ۟:L۟/kb;

    invoke-static {}, L۟/q$c;->ۥ۟۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, L۟/k3;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, L۟/k3;-><init>(L۟/g3;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :array_0
    .array-data 1
        -0x38t
        -0x7ft
        -0x31t
        0x28t
        0x32t
        0x33t
        -0x38t
        -0x75t
    .end array-data

    :array_1
    .array-data 1
        -0x55t
        -0x20t
        -0x5dt
        0x44t
        0x50t
        0x52t
    .end array-data
.end method

.method public static ۥ۟()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, L۟/h2;->ۥ۟ۢ:Ljava/util/List;

    .line 2
    .line 3
    sget-object v1, L۟/i8;->ۥ:L۟/i8$a;

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    invoke-static {v2, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "random"

    .line 11
    .line 12
    invoke-static {v2, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1, v2}, L۟/i8$a;->ۥ۟۠(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, L۟/h2;->ۥۣ۟:Ljava/lang/String;

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 52
    .line 53
    const-string v1, "Collection is empty."

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method
