.class public final La/Ve$a;
.super La/qd$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/Ve;->c(Landroid/content/Context;La/a2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a2;

.field public final synthetic b:La/Ve;


# direct methods
.method public constructor <init>(La/Ve;La/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Ve$a;->b:La/Ve;

    iput-object p2, p0, La/Ve$a;->a:La/a2;

    return-void
.end method


# virtual methods
.method public final b(I)V
    .locals 2

    iget-object v0, p0, La/Ve$a;->b:La/Ve;

    const/4 v1, 0x1

    iput-boolean v1, v0, La/Ve;->m:Z

    iget-object v0, p0, La/Ve$a;->a:La/a2;

    invoke-virtual {v0, p1}, La/a2;->d(I)V

    return-void
.end method

.method public final c(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, La/Ve$a;->b:La/Ve;

    iget v1, v0, La/Ve;->c:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, v0, La/Ve;->n:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    iput-boolean p1, v0, La/Ve;->m:Z

    iget-object p1, v0, La/Ve;->n:Landroid/graphics/Typeface;

    const/4 v0, 0x0

    iget-object v1, p0, La/Ve$a;->a:La/a2;

    invoke-virtual {v1, p1, v0}, La/a2;->e(Landroid/graphics/Typeface;Z)V

    return-void
.end method
