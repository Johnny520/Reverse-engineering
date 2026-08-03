.class public final synthetic Lce/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic a:Ljava/util/BitSet;

.field public final synthetic b:[I


# direct methods
.method public synthetic constructor <init>(Ljava/util/BitSet;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lce/q;->a:Ljava/util/BitSet;

    .line 5
    .line 6
    iput-object p2, p0, Lce/q;->b:[I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lce/q;->b:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    iget-object v0, p0, Lce/q;->a:Ljava/util/BitSet;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
