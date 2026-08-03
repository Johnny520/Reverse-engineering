.class public abstract LF6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LKm;
.implements Ljava/io/Serializable;


# instance fields
.field public transient a:LKm;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Class;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF6;->b:Ljava/lang/Object;

    iput-object p2, p0, LF6;->c:Ljava/lang/Class;

    iput-object p3, p0, LF6;->d:Ljava/lang/String;

    iput-object p4, p0, LF6;->e:Ljava/lang/String;

    iput-boolean p5, p0, LF6;->f:Z

    return-void
.end method


# virtual methods
.method public abstract c()LKm;
.end method

.method public final e()Ly9;
    .locals 2

    iget-boolean v0, p0, LF6;->f:Z

    iget-object v1, p0, LF6;->c:Ljava/lang/Class;

    if-eqz v0, :cond_0

    sget-object v0, LJv;->a:LKv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lzt;

    invoke-direct {v0, v1}, Lzt;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_0
    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    return-object v0
.end method
