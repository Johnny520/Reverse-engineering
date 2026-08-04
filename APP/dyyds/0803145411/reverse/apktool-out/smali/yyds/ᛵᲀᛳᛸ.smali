.class public final synthetic Lyyds/ᛵᲀᛳᛸ;
.super Ljava/lang/Object;

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

.field public final synthetic ᛶᛷᛲᲁ:Z

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

.field public final synthetic ᲇᲇᲇᛱ:J

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xba

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᲀᛳᛸ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛵᲀᛳᛸ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛵᲀᛳᛸ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    iput-wide p4, p0, Lyyds/ᛵᲀᛳᛸ;->ᲇᲇᲇᛱ:J

    .line 11
    .line 12
    iput-boolean p6, p0, Lyyds/ᛵᲀᛳᛸ;->ᛶᛷᛲᲁ:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final native ᛲᲈᲁ()Ljava/lang/Object;
.end method
