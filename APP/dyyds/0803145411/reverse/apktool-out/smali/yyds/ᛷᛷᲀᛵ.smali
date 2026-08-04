.class public final Lyyds/ᛷᛷᲀᛵ;
.super Ljava/lang/Object;

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛷᛷᲀᛵ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛷᛷᲀᛵ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8a

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    .line 1
    new-instance v0, Lyyds/ᛷᛷᲀᛵ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛷᛷᲀᛵ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛷᛷᲀᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛷᲀᛵ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᛷᛷᲀᛵ;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛷᛷᲀᛵ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛷᛷᲀᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛷᲀᛵ;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛷᛷᲀᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final native ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
.end method
