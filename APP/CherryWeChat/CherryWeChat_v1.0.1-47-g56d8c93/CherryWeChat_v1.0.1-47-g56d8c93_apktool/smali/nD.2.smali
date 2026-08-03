.class public final LnD;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbs;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/ContentResolver;

.field public final c:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/ContentResolver;ZI)V
    .locals 0

    iput p3, p0, LnD;->a:I

    iput-object p1, p0, LnD;->b:Landroid/content/ContentResolver;

    iput-boolean p2, p0, LnD;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final p(Lqs;)Las;
    .locals 0

    iget p1, p0, LnD;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, LoD;

    invoke-direct {p1, p0}, LoD;-><init>(LnD;)V

    return-object p1

    :pswitch_0
    new-instance p1, LoD;

    invoke-direct {p1, p0}, LoD;-><init>(LnD;)V

    return-object p1

    :pswitch_1
    new-instance p1, LoD;

    invoke-direct {p1, p0}, LoD;-><init>(LnD;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
