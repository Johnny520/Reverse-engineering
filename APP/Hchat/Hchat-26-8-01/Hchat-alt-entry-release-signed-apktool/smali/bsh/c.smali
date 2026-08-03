.class public final synthetic Lbsh/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/IntSupplier;


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
    iput p1, p0, Lbsh/c;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getAsInt()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/c;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Lbsh/BshArray;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
