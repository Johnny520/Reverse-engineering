.class public final synthetic La/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/o2;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/o2;Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n2;->a:La/o2;

    iput-object p2, p0, La/n2;->b:Ljava/lang/Object;

    iput p3, p0, La/n2;->c:I

    iput p4, p0, La/n2;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, La/n2;->a:La/o2;

    iget-object v1, p0, La/n2;->b:Ljava/lang/Object;

    iget v2, p0, La/n2;->c:I

    iget v3, p0, La/n2;->d:I

    iget-boolean v4, v0, La/o2;->a:Z

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v1, v2, v3}, La/o2;->a(Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method
