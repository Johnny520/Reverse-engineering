.class public abstract LF0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LO0/a;


# instance fields
.field public a:LF0/x;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LF0/x;->b:LF0/x;

    .line 5
    .line 6
    iput-object v0, p0, LF0/b;->a:LF0/x;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget-object v0, p0, LF0/b;->a:LF0/x;

    .line 2
    .line 3
    sget-object v1, LF0/x;->d:LF0/x;

    .line 4
    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, LF0/b;->a:LF0/x;

    .line 17
    .line 18
    invoke-virtual {p0}, LF0/b;->a()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LF0/b;->a:LF0/x;

    .line 22
    .line 23
    sget-object v1, LF0/x;->a:LF0/x;

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v1, "Failed requirement."

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF0/b;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, LF0/x;->b:LF0/x;

    .line 8
    .line 9
    iput-object v0, p0, LF0/b;->a:LF0/x;

    .line 10
    .line 11
    iget-object v0, p0, LF0/b;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
