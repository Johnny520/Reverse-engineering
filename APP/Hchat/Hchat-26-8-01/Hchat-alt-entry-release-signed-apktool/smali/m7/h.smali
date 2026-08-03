.class public final Lm7/h;
.super Lz7/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic i:[Ljava/lang/String;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(Lz7/f;[Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p2, p0, Lm7/h;->i:[Ljava/lang/String;

    .line 2
    .line 3
    iput p3, p0, Lm7/h;->j:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lz7/m;-><init>(Ljava/util/Iterator;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 2

    .line 1
    check-cast p1, Lm7/j;

    .line 2
    .line 3
    iget-object v0, p0, Lm7/h;->i:[Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Lm7/h;->j:I

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, Lm7/i;->Q([Ljava/lang/String;I)Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
