.class public final La/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Lg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:La/q;


# direct methods
.method public constructor <init>(La/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q$a;->c:La/q;

    const/4 p1, 0x0

    iput-boolean p1, p0, La/q$a;->a:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, La/q$a;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/q$a;->c:La/q;

    const/4 v1, 0x0

    iput-object v1, v0, La/q;->f:La/Jg;

    iget v1, p0, La/q$a;->b:I

    invoke-static {v0, v1}, La/q;->b(La/q;I)V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La/q$a;->a:Z

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, La/q$a;->c:La/q;

    invoke-static {v0}, La/q;->a(La/q;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/q$a;->a:Z

    return-void
.end method
