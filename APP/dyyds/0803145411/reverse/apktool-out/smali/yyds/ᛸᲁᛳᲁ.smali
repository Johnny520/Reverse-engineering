.class public final synthetic Lyyds/ᛸᲁᛳᲁ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11a

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 15
    iput p1, p0, Lyyds/ᛸᲁᛳᲁ;->ᲀᛲᛳᲀ:I

    iput-boolean p4, p0, Lyyds/ᛸᲁᛳᲁ;->ᲇᲈᛵᛷ:Z

    iput-object p2, p0, Lyyds/ᛸᲁᛳᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛸᲁᛳᲁ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/Object;ZI)V
    .locals 0

    .line 14
    iput p4, p0, Lyyds/ᛸᲁᛳᲁ;->ᲀᛲᛳᲀ:I

    iput-object p1, p0, Lyyds/ᛸᲁᛳᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛸᲁᛳᲁ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput-boolean p3, p0, Lyyds/ᛸᲁᛳᲁ;->ᲇᲈᛵᛷ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;ZLcom/ss/android/ugc/awemes/MainActivity;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lyyds/ᛸᲁᛳᲁ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛸᲁᛳᲁ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lyyds/ᛸᲁᛳᲁ;->ᲇᲈᛵᛷ:Z

    .line 10
    .line 11
    iput-object p3, p0, Lyyds/ᛸᲁᛳᲁ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final native run()V
.end method
