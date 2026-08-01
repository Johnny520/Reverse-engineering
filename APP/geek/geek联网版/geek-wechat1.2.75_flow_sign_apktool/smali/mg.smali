.class public final synthetic Lmg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lng;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lng;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmg;->a:Lng;

    .line 5
    .line 6
    iput p2, p0, Lmg;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lmg;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lmg;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lmg;->a:Lng;

    .line 4
    .line 5
    iget-object v1, v1, Lng;->b:Lqy;

    .line 6
    .line 7
    iget v2, p0, Lmg;->b:I

    .line 8
    .line 9
    invoke-interface {v1, v2, v0}, Lqy;->i(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
