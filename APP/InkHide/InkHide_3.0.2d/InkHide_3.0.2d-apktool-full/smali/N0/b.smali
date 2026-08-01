.class public abstract LN0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/a;
.implements Ljava/io/Serializable;


# instance fields
.field public transient a:LS0/a;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Class;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN0/b;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LN0/b;->c:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, LN0/b;->d:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LN0/b;->e:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, LN0/b;->f:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public abstract a()LS0/a;
.end method

.method public final b()LN0/c;
    .locals 2

    .line 1
    iget-object v0, p0, LN0/b;->c:Ljava/lang/Class;

    .line 2
    .line 3
    iget-boolean v1, p0, LN0/b;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, LN0/m;->a:LN0/n;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, LN0/j;

    .line 13
    .line 14
    invoke-direct {v1, v0}, LN0/j;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    sget-object v1, LN0/m;->a:LN0/n;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, LN0/d;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LN0/d;-><init>(Ljava/lang/Class;)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method
