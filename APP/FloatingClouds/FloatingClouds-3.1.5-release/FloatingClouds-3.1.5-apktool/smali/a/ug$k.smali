.class public final La/ug$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/ug;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field public final a:La/dc;


# direct methods
.method public constructor <init>(La/dc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ug$k;->a:La/dc;

    return-void
.end method


# virtual methods
.method public final onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    new-instance v0, La/W3;

    new-instance v1, La/W3$d;

    invoke-direct {v1, p2}, La/W3$d;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, La/W3;-><init>(La/W3$e;)V

    iget-object v1, p0, La/ug$k;->a:La/dc;

    invoke-interface {v1, p1, v0}, La/dc;->a(Landroid/view/View;La/W3;)La/W3;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    iget-object p1, p1, La/W3;->a:La/W3$e;

    invoke-interface {p1}, La/W3$e;->c()Landroid/view/ContentInfo;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, La/t2;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
