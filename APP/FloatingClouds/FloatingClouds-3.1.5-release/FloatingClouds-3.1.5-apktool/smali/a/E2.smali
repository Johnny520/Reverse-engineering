.class public abstract La/E2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o9;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/E2$a;
    }
.end annotation


# instance fields
.field public transient a:La/o9;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Class;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/E2;->b:Ljava/lang/Object;

    iput-object p2, p0, La/E2;->c:Ljava/lang/Class;

    iput-object p3, p0, La/E2;->d:Ljava/lang/String;

    iput-object p4, p0, La/E2;->e:Ljava/lang/String;

    iput-boolean p5, p0, La/E2;->f:Z

    return-void
.end method


# virtual methods
.method public final c()La/a3;
    .locals 2

    iget-object v0, p0, La/E2;->c:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-boolean v1, p0, La/E2;->f:Z

    if-eqz v1, :cond_1

    sget-object v1, La/Tc;->a:La/Uc;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La/kc;

    invoke-direct {v1, v0}, La/kc;-><init>(Ljava/lang/Class;)V

    return-object v1

    :cond_1
    sget-object v1, La/Tc;->a:La/Uc;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La/f3;

    invoke-direct {v1, v0}, La/f3;-><init>(Ljava/lang/Class;)V

    return-object v1
.end method
