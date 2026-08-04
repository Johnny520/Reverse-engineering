.class public final synthetic Lyyds/ᲈᛶᛵᛱ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/widget/EditText;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa7

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/EditText;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲈᛶᛵᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲈᛶᛵᛱ;->ᲇᲈᛵᛷ:Landroid/widget/EditText;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲈᛶᛵᛱ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final native run()V
.end method
