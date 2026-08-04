.class public final Lyyds/ᛳᛶᛴᛵ;
.super Lyyds/ᛸᲀᛷᲀ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Landroid/app/Activity;

.field public final synthetic ᛲᛲᲈᲈ:Landroid/content/Context;

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᛸᛵᲀᛱ;

.field public final synthetic ᛶᛷᛲᲁ:Landroid/content/Context;

.field public final synthetic ᛷᛲᲈᛱ:Ljava/lang/String;

.field public final synthetic ᛷᛵᲇᲀ:Ljava/lang/String;

.field public final synthetic ᛷᲈᲈᲁ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x104

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lyyds/ᛸᛵᲀᛱ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛳᛶᛴᛵ;->ᛶᛷᛲᲁ:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛳᛶᛴᛵ;->ᛱᲈᲁ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛳᛶᛴᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛸᛵᲀᛱ;

    .line 6
    .line 7
    iput-object p4, p0, Lyyds/ᛳᛶᛴᛵ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lyyds/ᛳᛶᛴᛵ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lyyds/ᛳᛶᛴᛵ;->ᛷᛵᲇᲀ:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Lyyds/ᛳᛶᛴᛵ;->ᛲᛲᲈᲈ:Landroid/content/Context;

    .line 14
    .line 15
    invoke-direct {p0, p8}, Lyyds/ᛸᲀᛷᲀ;-><init>(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static final native ᛱᲈᲁ(Landroid/widget/TextView;[Ljava/lang/String;Landroid/view/View;Landroid/widget/Switch;)V
.end method

.method public static final native ᛶᛷᛲᲁ(Landroid/widget/TextView;)V
.end method


# virtual methods
.method public final native ᲇᲇᲇᛱ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;Landroid/view/View;)V
.end method
