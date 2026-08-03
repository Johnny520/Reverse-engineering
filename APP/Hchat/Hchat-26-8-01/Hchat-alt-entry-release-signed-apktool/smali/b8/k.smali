.class public abstract Lb8/k;
.super Lb8/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lz7/s;


# static fields
.field public static final j:Lz7/b;


# instance fields
.field public h:Lz7/c;

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lz7/c;->o:Lz7/b;

    .line 2
    .line 3
    sput-object v0, Lb8/k;->j:Lz7/b;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lb8/k;->j:Lz7/b;

    .line 5
    .line 6
    iput-object v0, p0, Lb8/k;->h:Lz7/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb8/k;->h:Lz7/c;

    .line 3
    .line 4
    iget-object v0, v0, Lz7/c;->g:[Ljava/lang/Object;

    .line 5
    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    check-cast p1, Lb8/j;

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-object p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lz7/l;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz7/l;-><init>(Lz7/s;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final m(Lb8/j;)V
    .locals 3

    .line 1
    const-string v0, "Duplicate node: "

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v1, p0, Lb8/k;->h:Lz7/c;

    .line 8
    .line 9
    sget-object v2, Lb8/k;->j:Lz7/b;

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    new-instance v1, Lz7/c;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2}, Lz7/c;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lb8/k;->h:Lz7/c;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    iget-object v1, p0, Lb8/k;->h:Lz7/c;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Lz7/c;->c(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    iget-object v0, p0, Lb8/k;->h:Lz7/c;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    if-eq p0, p1, :cond_2

    .line 38
    .line 39
    iput-object p0, p1, Lb8/j;->g:Lb8/j;

    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, Lb8/k;->h:Lz7/c;

    .line 42
    .line 43
    invoke-virtual {p1}, Lz7/c;->size()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget v0, p0, Lb8/k;->i:I

    .line 48
    .line 49
    sub-int/2addr p1, v0

    .line 50
    const/16 v0, 0x3e8

    .line 51
    .line 52
    if-le p1, v0, :cond_3

    .line 53
    .line 54
    iget-object p1, p0, Lb8/k;->h:Lz7/c;

    .line 55
    .line 56
    invoke-virtual {p1}, Lz7/c;->m()V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lb8/k;->h:Lz7/c;

    .line 60
    .line 61
    invoke-virtual {p1}, Lz7/c;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iput p1, p0, Lb8/k;->i:I

    .line 66
    .line 67
    :cond_3
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    throw p1
.end method

.method public abstract n()Lb8/f;
.end method

.method public abstract o()Lb8/h;
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb8/k;->h:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
