.class public interface abstract Lcom/google/android/material/datepicker/DateSelector;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# direct methods
.method public static varargs 飘花落叶言子楪兰世哲苏([Landroid/widget/EditText;)V
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    new-instance v0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪苏哲世兰;-><init>([Landroid/widget/EditText;)V

    .line 8
    .line 9
    .line 10
    array-length v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, p0, v3

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    aget-object p0, p0, v2

    .line 24
    .line 25
    new-instance v0, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世苏哲;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰世苏哲;-><init>(Landroid/view/View;I)V

    .line 29
    .line 30
    .line 31
    const-wide/16 v1, 0x64

    .line 32
    .line 33
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public abstract 飘花落叶言子世哲兰楪苏(J)V
.end method

.method public abstract 飘花落叶言子世哲楪兰苏(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;)Landroid/view/View;
.end method

.method public abstract 飘花落叶言子世楪兰哲苏()Z
.end method

.method public abstract 飘花落叶言子世楪哲苏兰(Landroid/content/Context;)I
.end method

.method public abstract 飘花落叶言子世苏哲兰楪()Ljava/lang/Object;
.end method

.method public abstract 飘花落叶言子世苏楪兰哲()Ljava/util/ArrayList;
.end method

.method public abstract 飘花落叶言子楪兰哲苏世(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public abstract 飘花落叶言子楪苏世兰哲(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public abstract 飘花落叶言子楪苏哲世兰()Ljava/util/ArrayList;
.end method
