.class public final synthetic Lbsh/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lbsh/g;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/g;->a:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Lbsh/CollectionManager;->a(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
