.class public final Lyyds/ᛸᲀᛸᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static volatile ᛱᲈᲁ:Z

.field public static volatile ᛲᛳᛶᲁ:Z

.field public static ᛲᛴᛳᛲ:Ljava/lang/String;

.field public static final ᛲᲈᲁ:Lyyds/ᛸᲀᛸᲇ;

.field public static final ᛵᛸᛸᛷ:Ljava/util/ArrayList;

.field public static ᛶᛷᛲᲁ:J

.field public static ᲀᛲᛳᲀ:Lyyds/ᛷᲁᛷᛵ;

.field public static ᲇᲇᲇᛱ:Ljava/util/Set;

.field public static ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x1f3b2e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛸᲀᛸᲇ;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᛸᲀᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛸᲀᛸᲇ;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lyyds/ᛸᲀᛸᲇ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lyyds/ᛸᲀᛸᲇ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    sget-object v0, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 32
    .line 33
    sput-object v0, Lyyds/ᛸᲀᛸᲇ;->ᲇᲇᲇᛱ:Ljava/util/Set;

    .line 34
    .line 35
    return-void
.end method

.method public static native ᛲᛴᛳᛲ(Landroid/app/Activity;)Z
.end method

.method public static native ᲀᛲᛳᲀ(Ljava/lang/String;)V
.end method


# virtual methods
.method public final native declared-synchronized ᛲᲈᲁ(Landroid/app/Activity;)Z
.end method

.method public final native declared-synchronized ᛵᛸᛸᛷ(Lyyds/ᛷᲁᛷᛵ;Z)V
.end method

.method public final native declared-synchronized ᲇᲈᛵᛷ(Landroid/app/Activity;Lyyds/ᛷᲁᛷᛵ;)Z
.end method
