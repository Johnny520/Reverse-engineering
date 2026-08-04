.class public final Lyyds/ᛲᛱᛳᛶ;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛲᛱᛳᛶ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛲᛱᛳᛶ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛲᛱᛳᛶ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final native onAnimationEnd(Landroid/animation/Animator;)V
.end method
