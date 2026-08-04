.class public final Lyyds/ᛸᛷᛶᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛶᲇ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/util/Map;

.field public final ᛵᛸᛸᛷ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛸᛷᛶᲇ;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 4
    .line 5
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lyyds/ᛸᛷᛶᲇ;-><init>(Ljava/util/Map;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lyyds/ᛸᛷᛶᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛶᲇ;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛷᛶᲇ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛸᛷᛶᲇ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method
