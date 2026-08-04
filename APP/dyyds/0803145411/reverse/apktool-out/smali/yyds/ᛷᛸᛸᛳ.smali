.class public abstract Lyyds/ᛷᛸᛸᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ᲇᲈᛵᛷ:Lyyds/ᛳᲁᛷᛷ;


# instance fields
.field public final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛳᲁᛷᛷ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛷᛸᛸᛳ;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛷᛸᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲁᛷᛷ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛸᛸᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛷᛸᛸᛳ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛷᛸᛸᛳ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛸᛳ;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public ᛲᲈᲁ(Lyyds/ᛷᛸᛸᛳ;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛷᛸᛸᛳ;->ᛵᛸᛸᛷ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Lyyds/ᛷᛸᛸᛳ;->ᛵᛸᛸᛷ()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    mul-int/lit8 p0, p0, -0x1

    .line 22
    .line 23
    return p0
.end method

.method public abstract ᛵᛸᛸᛷ()Ljava/lang/Object;
.end method
