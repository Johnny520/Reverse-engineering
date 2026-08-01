.class public final LZ0/c;
.super LD/h;
.source "SourceFile"


# instance fields
.field public d:Ljava/util/List;


# virtual methods
.method public final Y(LZ0/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/c;->d:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, LZ0/c;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
