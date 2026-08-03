.class public final synthetic La/Za;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g;


# instance fields
.field public final synthetic a:La/ab;

.field public final synthetic b:La/gb;


# direct methods
.method public synthetic constructor <init>(La/ab;La/gb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Za;->a:La/ab;

    iput-object p2, p0, La/Za;->b:La/gb;

    return-void
.end method


# virtual methods
.method public final a(La/y9;Landroidx/lifecycle/e$a;)V
    .locals 1

    sget-object p1, Landroidx/lifecycle/e$a;->ON_DESTROY:Landroidx/lifecycle/e$a;

    iget-object v0, p0, La/Za;->a:La/ab;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, La/Za;->b:La/gb;

    invoke-virtual {v0, p1}, La/ab;->a(La/gb;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
