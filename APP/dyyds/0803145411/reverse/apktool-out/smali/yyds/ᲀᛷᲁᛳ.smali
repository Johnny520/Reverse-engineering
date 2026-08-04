.class public abstract Lyyds/ᲀᛷᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Ljava/lang/ThreadLocal;

.field public static final ᛵᛸᛸᛷ:Ljava/util/WeakHashMap;

.field public static final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲀᛷᲁᛳ;->ᛲᲈᲁ:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᲀᛷᲁᛳ;->ᛵᛸᛸᛷ:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lyyds/ᲀᛷᲁᛳ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method
