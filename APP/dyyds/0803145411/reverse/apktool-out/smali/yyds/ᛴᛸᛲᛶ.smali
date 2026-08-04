.class public final synthetic Lyyds/ᛴᛸᛲᛶ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/graphics/Rect;

.field public final synthetic ᛲᲈᲁ:Lyyds/ᲇᛶᲀᲁ;

.field public final synthetic ᛵᛸᛸᛷ:Landroid/view/View;

.field public final synthetic ᛶᛷᛲᲁ:F

.field public final synthetic ᲀᛲᛳᲀ:Lcom/bytedance/im/core/model/Message;

.field public final synthetic ᲇᲇᲇᛱ:F

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛷᛵᛵᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd2

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᲇᛶᲀᲁ;Landroid/view/View;Lcom/bytedance/im/core/model/Message;Lyyds/ᛷᛵᛵᲇ;Landroid/graphics/Rect;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛸᛲᛶ;->ᛲᲈᲁ:Lyyds/ᲇᛶᲀᲁ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛴᛸᛲᛶ;->ᛵᛸᛸᛷ:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛴᛸᛲᛶ;->ᲀᛲᛳᲀ:Lcom/bytedance/im/core/model/Message;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛴᛸᛲᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛵᛵᲇ;

    .line 11
    .line 12
    iput-object p5, p0, Lyyds/ᛴᛸᛲᛶ;->ᛲᛴᛳᛲ:Landroid/graphics/Rect;

    .line 13
    .line 14
    iput p6, p0, Lyyds/ᛴᛸᛲᛶ;->ᲇᲇᲇᛱ:F

    .line 15
    .line 16
    iput p7, p0, Lyyds/ᛴᛸᛲᛶ;->ᛶᛷᛲᲁ:F

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final native onAnimationUpdate(Landroid/animation/ValueAnimator;)V
.end method
