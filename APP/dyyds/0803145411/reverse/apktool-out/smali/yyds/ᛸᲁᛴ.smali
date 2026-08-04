.class public final Lyyds/ᛸᲁᛴ;
.super Lyyds/ᛴᲀᛴᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛱᲈᲁ:J


# instance fields
.field private volatile synthetic _invoked$volatile:I

.field public final ᛶᛷᛲᲁ:Lyyds/ᲈᛳᲀᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛸᲁᛴ;

    .line 4
    .line 5
    const-string v2, "_invoked$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lyyds/ᛸᲁᛴ;->ᛱᲈᲁ:J

    .line 16
    .line 17
    return-void
.end method

.method public native constructor <init>(Lyyds/ᲈᛳᲀᲈ;)V
.end method


# virtual methods
.method public final ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v2, Lyyds/ᛸᲁᛴ;->ᛱᲈᲁ:J

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x1

    .line 7
    move-object v1, p0

    .line 8
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-object p0, v1, Lyyds/ᛸᲁᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛳᲀᲈ;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lyyds/ᲈᛳᲀᲈ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final ᛷᛵᲇᲀ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
