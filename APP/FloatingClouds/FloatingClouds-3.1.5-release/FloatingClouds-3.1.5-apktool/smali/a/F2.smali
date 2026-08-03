.class public final La/F2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/Mf$a;

.field public final synthetic b:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(La/Mf$a;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/F2;->a:La/Mf$a;

    iput-object p2, p0, La/F2;->b:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La/F2;->a:La/Mf$a;

    iget-object v0, v0, La/Mf$a;->u:La/qd$e;

    if-eqz v0, :cond_0

    iget-object v1, p0, La/F2;->b:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, La/qd$e;->c(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
