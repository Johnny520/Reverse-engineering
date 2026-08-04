.class public final synthetic Lyyds/ᲁᛲᲀᲈ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᛴᲁᛱᲇ;

.field public final synthetic ᛲᛳᛶᲁ:Landroid/util/DisplayMetrics;

.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛳᛱᛲᲇ;

.field public final synthetic ᛶᛷᛲᲁ:Landroid/view/WindowManager$LayoutParams;

.field public final synthetic ᛷᛲᲈᛱ:Lyyds/ᛸᛴᛳᛷ;

.field public final synthetic ᛷᲈᲈᲁ:Lyyds/ᛴᛸᛵᲈ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Lyyds/ᛴᲁᛱᲇ;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛳᛱᛲᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc0

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛸᛴᛳᛷ;Lyyds/ᛳᛱᛲᲇ;Lyyds/ᛳᛱᛲᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/view/WindowManager$LayoutParams;Lyyds/ᛴᲁᛱᲇ;Landroid/util/DisplayMetrics;Lyyds/ᛴᛸᛵᲈ;I)V
    .locals 0

    .line 1
    iput p9, p0, Lyyds/ᲁᛲᲀᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᛲᲀᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛴᛳᛷ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲁᛲᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛱᛲᲇ;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᲁᛲᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛳᛱᛲᲇ;

    .line 8
    .line 9
    iput-object p4, p0, Lyyds/ᲁᛲᲀᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲁᛱᲇ;

    .line 10
    .line 11
    iput-object p5, p0, Lyyds/ᲁᛲᲀᲈ;->ᛶᛷᛲᲁ:Landroid/view/WindowManager$LayoutParams;

    .line 12
    .line 13
    iput-object p6, p0, Lyyds/ᲁᛲᲀᲈ;->ᛱᲈᲁ:Lyyds/ᛴᲁᛱᲇ;

    .line 14
    .line 15
    iput-object p7, p0, Lyyds/ᲁᛲᲀᲈ;->ᛲᛳᛶᲁ:Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    iput-object p8, p0, Lyyds/ᲁᛲᲀᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛸᛵᲈ;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final native onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
.end method
