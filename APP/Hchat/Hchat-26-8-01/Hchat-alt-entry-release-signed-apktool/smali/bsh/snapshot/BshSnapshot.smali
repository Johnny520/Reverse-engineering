.class public final Lbsh/snapshot/BshSnapshot;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final FORMAT_VERSION:I = 0x1

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final formatVersion:I

.field private final nodes:[Lbsh/Node;


# direct methods
.method public constructor <init>([Lbsh/Node;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lbsh/snapshot/BshSnapshot;->formatVersion:I

    .line 6
    .line 7
    iput-object p1, p0, Lbsh/snapshot/BshSnapshot;->nodes:[Lbsh/Node;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public getFormatVersion()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/snapshot/BshSnapshot;->formatVersion:I

    .line 2
    .line 3
    return v0
.end method

.method public getNodes()[Lbsh/Node;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/snapshot/BshSnapshot;->nodes:[Lbsh/Node;

    .line 2
    .line 3
    return-object v0
.end method
