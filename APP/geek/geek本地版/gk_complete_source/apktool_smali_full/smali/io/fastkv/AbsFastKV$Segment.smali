.class public Lio/fastkv/AbsFastKV$Segment;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/AbsFastKV;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Segment"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lio/fastkv/AbsFastKV$Segment;",
        ">;"
    }
.end annotation


# instance fields
.field end:I

.field start:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/fastkv/AbsFastKV$Segment;->start:I

    .line 5
    .line 6
    iput p2, p0, Lio/fastkv/AbsFastKV$Segment;->end:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public compareTo(Lio/fastkv/AbsFastKV$Segment;)I
    .locals 1

    .line 2
    iget v0, p0, Lio/fastkv/AbsFastKV$Segment;->start:I

    iget p1, p1, Lio/fastkv/AbsFastKV$Segment;->start:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lio/fastkv/AbsFastKV$Segment;

    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV$Segment;->compareTo(Lio/fastkv/AbsFastKV$Segment;)I

    move-result p1

    return p1
.end method
