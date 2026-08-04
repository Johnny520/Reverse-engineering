.class public final synthetic Lyyds/ᛳᛱᛱᛷ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/content/Context;

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/String;

.field public final synthetic ᲇᲈᛵᛷ:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1e

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Lyyds/ᛳᛱᛱᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᛱᛱᛷ;->ᲇᲈᛵᛷ:Landroid/app/Dialog;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛳᛱᛱᛷ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛳᛱᛱᛷ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lyyds/ᛳᛱᛱᛷ;->ᛶᛷᛲᲁ:Ljava/lang/String;

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
