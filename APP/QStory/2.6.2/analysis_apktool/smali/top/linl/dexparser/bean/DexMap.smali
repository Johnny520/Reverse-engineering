.class public Ltop/linl/dexparser/bean/DexMap;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/linl/dexparser/bean/DexMap$Item;
    }
.end annotation


# static fields
.field public static final TYPE_ANNOTATIONS_DIRECTORY_ITEM:I = 0x2006

.field public static final TYPE_ANNOTATION_ITEM:I = 0x2004

.field public static final TYPE_ANNOTATION_SET_ITEM:I = 0x1003

.field public static final TYPE_ANNOTATION_SET_REF_LIST:I = 0x1002

.field public static final TYPE_CALL_SITE_ID_ITEM:I = 0x7

.field public static final TYPE_CLASS_DATA_ITEM:I = 0x2000

.field public static final TYPE_CLASS_DEF_ITEM:I = 0x6

.field public static final TYPE_CODE_ITEM:I = 0x2001

.field public static final TYPE_DEBUG_INFO_ITEM:I = 0x2003

.field public static final TYPE_ENCODED_ARRAY_ITEM:I = 0x2005

.field public static final TYPE_FIELD_ID_ITEM:I = 0x4

.field public static final TYPE_HEADER_ITEM:I = 0x0

.field public static final TYPE_HIDDENAPI_CLASS_DATA_ITEM:I = 0xf000

.field public static final TYPE_MAP_LIST:I = 0x1000

.field public static final TYPE_METHOD_HANDLE_ITEM:I = 0x8

.field public static final TYPE_METHOD_ID_ITEM:I = 0x5

.field public static final TYPE_PROTO_ID_ITEM:I = 0x3

.field public static final TYPE_STRING_DATA_ITEM:I = 0x2002

.field public static final TYPE_STRING_ID_ITEM:I = 0x1

.field public static final TYPE_TYPE_ID_ITEM:I = 0x2

.field public static final TYPE_TYPE_LIST:I = 0x1001


# instance fields
.field private final itemList:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Ltop/linl/dexparser/bean/DexMap$Item;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltop/linl/dexparser/bean/DexMap;->itemList:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public addItem(III)V
    .locals 2

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/bean/DexMap;->itemList:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ltop/linl/dexparser/bean/DexMap$Item;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2, p3}, Ltop/linl/dexparser/bean/DexMap$Item;-><init>(III)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public findItem(I)Ltop/linl/dexparser/bean/DexMap$Item;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/bean/DexMap;->itemList:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ltop/linl/dexparser/bean/DexMap$Item;

    .line 12
    .line 13
    return-object p0
.end method
