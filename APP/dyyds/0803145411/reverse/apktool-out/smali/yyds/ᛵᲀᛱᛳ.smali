.class public final synthetic Lyyds/ᛵᲀᛱᛳ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/content/Context;

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Z

.field public final synthetic ᲇᲈᛵᛷ:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x52

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p5, p0, Lyyds/ᛵᲀᛱᛳ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᲀᛱᛳ;->ᲇᲈᛵᛷ:Landroid/app/Dialog;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛵᲀᛱᛳ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛵᲀᛱᛳ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p4, p0, Lyyds/ᛵᲀᛱᛳ;->ᲇᲇᲇᛱ:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
