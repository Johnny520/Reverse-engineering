.class public final synthetic Lyyds/ᲀᲈᛸᛷ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛷᛸᛱᲇ;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᲀᛲᛳᲀ:Landroid/view/ViewGroup;

.field public final synthetic ᲇᲇᲇᛱ:J

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲇᛸᛸᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x53

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lyyds/ᲇᛸᛸᛳ;Lyyds/ᛷᛸᛱᲇ;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᲈᛸᛷ;->ᲀᛲᛳᲀ:Landroid/view/ViewGroup;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᲈᛸᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛸᛸᛳ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲀᲈᛸᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛸᛱᲇ;

    .line 9
    .line 10
    iput-wide p4, p0, Lyyds/ᲀᲈᛸᛷ;->ᲇᲇᲇᛱ:J

    .line 11
    .line 12
    iput p6, p0, Lyyds/ᲀᲈᛸᛷ;->ᛶᛷᛲᲁ:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final native run()V
.end method
