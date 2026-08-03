.class public final La/e7$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e7$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/e7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "j"
.end annotation


# instance fields
.field public final a:I

.field public final synthetic b:La/e7;


# direct methods
.method public constructor <init>(La/e7;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e7$j;->b:La/e7;

    iput p2, p0, La/e7$j;->a:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La/S1;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, La/e7$j;->b:La/e7;

    iget-object v1, v0, La/e7;->y:Landroidx/fragment/app/b;

    iget v2, p0, La/e7$j;->a:I

    if-eqz v1, :cond_0

    if-gez v2, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/b;->c()La/e7;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, La/e7;->R(II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v4

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v2, v1}, La/e7;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    return p1
.end method
