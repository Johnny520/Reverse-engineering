.class public final Lh4/v;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lg8/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lg8/b;II)V
    .locals 0

    .line 1
    add-int/2addr p4, p3

    .line 2
    invoke-virtual {p2, p3, p4}, Lg8/b;->n(II)Lg8/b;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    invoke-direct {p0, p1}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lh4/v;->b:Lg8/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/v;->b:Lg8/b;

    .line 2
    .line 3
    iget v0, v0, Lg8/b;->c:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x6

    .line 6
    .line 7
    return v0
.end method
